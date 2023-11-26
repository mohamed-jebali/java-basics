public class LogisticClassApplication {
    

    public static void main(String[]args){

        // INCAPSULAMENTO

        // esempio getters --> i getter permettono una maggiore sicurezza dei dati sensibili

        Logistic company1 = new Logistic("Ford",44);

        // System.out.println(company1.companyName); il richiamo dell'attributo companyName non e' accesibile dato che il modificatore d'accesso dell'attributo e private quindi e' accesbile solo all'interno della propria classe

        System.out.println(company1.getNameCompany()); // in questo modo sis utlizza il metodo che e' pubblico e permette di accedere all'attributo companyName anche se l'attributo e' private


        // esempio setters --> permette di settare un valore di un attributo private di una classe attraverso un metodo

        System.out.println("il numero di dipendenti: " + company1.setnumbersStaff(10)); // grazie a questo metodo per riuscire ad accedere al dato si utilizza il metodo setnumbersStaff un metodo set il quale cambia il valore iniziale attraverso un metodo creato nella classe di appartenenza
        
    }
}
