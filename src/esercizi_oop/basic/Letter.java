package esercizi_oop.basic;

public class Letter {

    final String from;
    final String to;
    final StringBuilder lines;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        lines=new StringBuilder();
    }
    public void addLine(String line){
        lines.append(line).append("\n");
    }
    public String getText(){
        StringBuilder ret=new StringBuilder();
        ret.append("Dear ").append(to).append(":\n\n");
        ret.append(lines);
        ret.append("\n");
        ret.append("Sincerely,\n\n").append(from);
        return ret.toString();
    }
}
