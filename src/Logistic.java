public class Logistic {
    
    private String companyName;
    private int numberEmployee;

    public Logistic(String companyName,int numberEmployee){

        this.companyName = companyName;
        this.numberEmployee = numberEmployee;
    }



    public String getNameCompany(){ // l'utilizzo di questo metodo fa si che l'attributo sia accesibile tramite l'uso del metodo piuttosto che l'attributo 

        return companyName;
    }

     public int setnumbersStaff(int numberEmployee){ // stesso sistema del metodo precedente ma permette di settare ovvero di impostare un valore usando come argomento numberEmployee cioe' l'attributo

        return numberEmployee;
    }
}
