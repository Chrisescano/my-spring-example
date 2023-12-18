package com.pluralsight.myspringexample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component @Qualifier("better")
public class BetterSecretSantaDAOImpl implements SecretSantaDAO {
    @Override
    public SecretSantaLink generateSecretSantaLink() {
        return new SecretSantaLink("Sahara", "Kerry");
    }
}
