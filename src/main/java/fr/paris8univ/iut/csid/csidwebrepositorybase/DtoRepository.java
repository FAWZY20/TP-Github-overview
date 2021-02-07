package fr.paris8univ.iut.csid.csidwebrepositorybase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DtoRepository {
    private final String name;
    private final String owner;
    private final int issues;
    private final int pullRequest;

    public DtoRepository(String name, String owner, int issues, int pullRequest){
        this.name = name;
        this.owner = owner;
        this.issues = issues;
        this.pullRequest = pullRequest;
    }

    public String getName() {
        return this.name;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getIssues() {
        return this.issues;
    }

    public int getPullRequest() {
        return this.pullRequest;
    }
}
