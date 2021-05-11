/**
 * 
 */
package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.*; 

import model.Item;

/**
 * @author User
 *
 */
@Path("/Items")
public class ItemService
{
 Item itemObj = new Item();
@GET
@Path("/")
@Produces(MediaType.TEXT_HTML)
public String readItems()
 {
 return "Hello";
 }
}