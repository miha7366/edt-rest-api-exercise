package com.edt.exercise.rest.services;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.edt.exercise.rest.model.Track;
import com.edt.exercise.rest.util.DatabaseUtils;


@Path("/newtrack")
public class TrackService {
	
	/**
	 * 
	 */
	@Consumes({"application/json"})
	@POST
	@Path("/{trackTitle}/{artist}/{albumId}/")
	@Produces({"application/json"})
	public Response insertTrack(@PathParam("trackTitle") String trackTitle, @PathParam("artist") String artist, @PathParam("albumId") int albumId) {
			try {
				ResultSetHandler<Track> handler = new BeanHandler<Track>(Track.class);
				//String sql = "INSERT INTO tracks (trackTitle, artist, albumId) VALUES ('"+trackTitle+"', '"+artist+"', '"+albumId+"')";
				Track track = DatabaseUtils.getQueryRunner().insert("INSERT INTO tracks (trackTitle, artist, albumId) VALUES (?, ?, ?)", handler, trackTitle, artist, albumId);
				if (track != null) {
					return Response.status(200).entity(track).build();
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
