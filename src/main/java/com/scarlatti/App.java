package com.scarlatti;

// import com.scarlatti.animals.*;

import com.scarlatti.animals.hippo.Hippo;
import com.scarlatti.animals.penguin.Penguin;

import static com.scarlatti.animals.hippo.Hippo.grunt;
import static com.scarlatti.animals.penguin.Penguin.*;

/**
 * Created by pc on 9/29/2017.
 */
public class App {

    public static void main(String[] args) {
        new Hippo();
        grunt();

        new Penguin();
        ork();
        squawk();
    }

}
