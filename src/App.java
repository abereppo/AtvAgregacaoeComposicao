public class App {
    public static void main(String[] args) {
        Professor p1 = new Professor("Ana Silva");
        Turma t = new Turma("ADS-101");

        t.setProfessor(p1);
        t.resumo();

        Professor p2 = new Professor("Carlos Souza");
        t.setProfessor(p2);
        t.resumo(); 
    }
}
