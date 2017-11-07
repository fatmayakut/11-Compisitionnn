package com.fyakut;

public class Araba {
    private Motor motr=new Motor();// motor arabadan türetilmemiş olup onun bir parcası durumundadır. buyuzden extends
                                     //kalitim yerine nesne üretip metodunu çağırmak gerekir.

    public void hareketZamani(){
        motr.motorCalısıtr();
    }
    public void durmaZamani(){
        motr.motorDur();
    }

}
