package fr.paris8univ.iut.csid.csidwebrepositorybase;


import fr.paris8univ.iut.csid.csidwebrepositorybase.DtoRepository;
import fr.paris8univ.iut.csid.csidwebrepositorybase.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class DaoRepository {

    private final RestTemplate restTemplate;

    @Autowired
    public  DaoRepository(RestTemplateBuilder restTemplateBuilder){

        this.restTemplate = restTemplateBuilder.build();
    }

    public void postIssue(Issue issue, String owner, String repository) {
        String repoURL = "https://api.github.com/repos/" + owner + "/" + repository + "/issues";
        String token = "Je les enelever afin que personne le vois";
        HttpHeaders requete = new HttpHeaders();
        requete.add("Authorization", "Bearer " + token);
        HttpEntity<Issue> reponse = restTemplate.exchange(
                repoURL,
                HttpMethod.POST,
                new HttpEntity<>(issue, requete),
                Issue.class);
    }

}
