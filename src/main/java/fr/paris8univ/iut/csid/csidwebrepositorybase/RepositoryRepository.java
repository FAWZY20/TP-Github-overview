package fr.paris8univ.iut.csid.csidwebrepositorybase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryRepository {

    private final RepositoryDao repositoryDao;
    private final DaoRepository daoRepository;

    @Autowired
    public RepositoryRepository(RepositoryDao repositoryDao, DaoRepository daoRepository){
        this.daoRepository = daoRepository;
        this.repositoryDao = repositoryDao;
    }
    public void postIssue(Issue issue, String repository){
        EntityRepository owner = new EntityRepository();
        if(!(repositoryDao.findById(repository).isEmpty())){
            owner = repositoryDao.findById(repository).get();
        }
        String ownerName = owner.getName();
        daoRepository.postIssue(issue, ownerName, repository);
    }
}
