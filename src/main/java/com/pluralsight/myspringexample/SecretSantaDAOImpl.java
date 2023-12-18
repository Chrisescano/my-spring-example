package com.pluralsight.myspringexample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component @Qualifier("basic")
public class SecretSantaDAOImpl implements SecretSantaDAO {
    @Override
    public SecretSantaLink generateSecretSantaLink() {
        return new SecretSantaLink();
    }
}
