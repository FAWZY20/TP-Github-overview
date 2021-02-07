package fr.paris8univ.iut.csid.csidwebrepositorybase;

import org.springframework.stereotype.Service;

@Service
public class ServiceRepository {
    private final RepositoryRepository repositoryRepository;

    public ServiceRepository(RepositoryRepository repositoryRepository) {

        this.repositoryRepository= repositoryRepository;

    }

    public void postIssue(Issue issue, String repository) {

        this.repositoryRepository.postIssue(issue, repository);

    }
}
