package com.hypad.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("overall")
public class overall  implements Pet{

    private Pet pet;

    @Override
    public void say() {
        System.out.println("Come here");
    }


    public Pet getPet() {
        return pet;
    }

    @Autowired
    @Qualifier("cat")
    public void setPet(Pet pet) {
        System.out.println("Class overall: set pet");
        this.pet = pet;
    }
}
