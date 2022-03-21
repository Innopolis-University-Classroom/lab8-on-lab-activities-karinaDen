package com.muwaffaq.innopolis.solid.LSP_IS.wrong;
//❌❌❌
// how many SOLID Does it Violates ?
// Fix it.
 interface FlyableBird {
    void fly();
    void eat();
    void hatch();
}


interface SwimmableBird {
    void eat();
    void hatch();
    void swim();
}
