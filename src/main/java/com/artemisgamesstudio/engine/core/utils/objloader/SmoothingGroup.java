package com.artemisgamesstudio.engine.core.utils.objloader;

import java.util.ArrayList;

import com.artemisgamesstudio.engine.core.model.Vertex;

public class SmoothingGroup
{
	private ArrayList<Face> faces;
	private ArrayList<Vertex> vertices;
	
	public SmoothingGroup()
	{
		faces = new ArrayList<Face>();
		vertices = new ArrayList<Vertex>();
	}
	
	public ArrayList<Vertex> getVertices()
	{
		return vertices;
	}
	public void setVertices(ArrayList<Vertex> vertices)
	{
		this.vertices = vertices;
	}

	public ArrayList<Face> getFaces()
	{
		return faces;
	}

	public void setFaces(ArrayList<Face> faces)
	{
		this.faces = faces;
	}
}
