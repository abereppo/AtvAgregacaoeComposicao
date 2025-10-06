public class Turma {
    private final String codigo;
    private Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    
    public void resumo() {
        String nomeProf = (professor == null) ? "sem professor" : professor.getNome();
        System.out.println("Turma: " + codigo + " | Professor: " + nomeProf);
    }
}
