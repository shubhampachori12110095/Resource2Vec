package org.aksw.r2v.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RDFEmbedding {
	
	private final String dataset;
	private final String method;
	private final String hyperp;
	private final String embeddings;
	
	public RDFEmbedding(String dataset, String method, String hyperp, String embeddings) {
		super();
		this.dataset = dataset;
		this.method = method;
		this.hyperp = hyperp;
		this.embeddings = embeddings;
	}
	
	public String getDataset() {
		return dataset;
	}
	
	public String getEmbeddings() {
		return embeddings;
	}

	public String getMethod() {
		return method;
	}

	@JsonProperty(URIs.HYPERP)
	public String getHyperp() {
		return hyperp;
	}
	
}