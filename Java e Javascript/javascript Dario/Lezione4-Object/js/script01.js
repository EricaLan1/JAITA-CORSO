// Notazione letterale le priorita' scritte con due punti e valori della prioprieta'
//chiave : valore
// Esempio di Dario

let user = {
     name: "Pippo",
   lastname: "Baudo",
    age:90,

   conduciSanremo: function () {
        return "Sto conducendo il festival di Sanremo";
   }
 }
    console.log("il nome dell user e': "+ user.name+" "+user);
    console.log(user.conduciSanremo());

    let admin = {
        username: "Megatron79",
        password: "12345",
        role: "Admin",

        //senza function ma sempre con le() e' la versione compatta del metodo

        gestisciAccount(){
            //il this fa riferimento all'oggetto admin, che cambia a basic
            this.role = "Basic";
        },
        gestisciPassword(nuovaPassword){
            this.password = nuovaPassword;
            // anche qui assegno un nuovo valore alla password
        }
    }

    admin.gestisciAccount();
    console.log(admin.role);

    admin.gestisciPassword("5678");
    console.log(admin.password);