package callback;

public class Callback {

	int intervalo;
    Botiga botiga;
    Pagament pagament;
   
    Callback(Botiga botiga, Pagament pagament){
        this.botiga = botiga;
        this.pagament = pagament;
    }
   
    void run(){
        	botiga.callback(pagament.metodePagament());
    }

}