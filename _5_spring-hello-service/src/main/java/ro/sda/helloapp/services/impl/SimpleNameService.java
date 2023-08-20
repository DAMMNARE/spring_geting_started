package ro.sda.helloapp.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ro.sda.helloapp.services.NameService;

@Service
@Qualifier("simple")
public class SimpleNameService implements NameService {

    public SimpleNameService() {
        System.out.println("SimpleNameService was created!");
    }

    @Override
    public String getName() {
        return "Madalin";
    }
}
