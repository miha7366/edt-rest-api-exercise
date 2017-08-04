package com.edt.exercise.rest.services;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.edt.exercise.rest.model.User;
import com.edt.exercise.rest.util.DatabaseUtils;

@Path("/user")
public class UserService {
	
	/**
	 * 
	 */
	@GET
	@Path("/{userId}")
	@Produces({
		"application/json"
	})

	public Response getUser(@PathParam("userId") int userId) {
		try {
			ResultSetHandler<User> handler = new BeanHandler<User>(User.class);
			User user = DatabaseUtils.getQueryRunner().query("SELECT * FROM Users WHERE userId = ?", handler, userId);
			if (user != null) {
				return Response.status(200).entity(user).build();
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


