package com.edt.exercise.rest.services;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.edt.exercise.rest.model.Track;
import com.edt.exercise.rest.util.DatabaseUtils;

@Path("/tracklist")
public class AlbumService {
	
	/**
	 * 
	 */
	@GET
	@Path("/{albumId}")
	@Produces({"application/json"})
	public Response getAlbumTracks(@PathParam("albumId") int albumId) {
		try {
			ResultSetHandler<List<Track>> handler = new BeanListHandler<Track>(Track.class);
			List<Track> tracklist = (List<Track>)DatabaseUtils.getQueryRunner().query("SELECT * FROM tracks WHERE albumId = ?", handler, albumId);
			if (tracklist!= null) {
			
				return Response.status(200).entity(tracklist).build();
			}
			else {
				return Response.status(404).build();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).build();
		}
	}
}
