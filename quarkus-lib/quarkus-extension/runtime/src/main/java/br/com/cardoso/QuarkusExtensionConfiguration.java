package br.com.cardoso;

import br.com.cardoso.impl.ConvertMessage;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class QuarkusExtensionConfiguration {

    @Produces
    public ConvertMessage produceConvertMessage()  {
        return new ConvertMessage();
    }
}
