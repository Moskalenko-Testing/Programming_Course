package lesson_23.paper;

public class MainPaper {
    public static void main(String[] args) {

        Paper paper = new Paper();

        Pencil pencil = new Pencil();

        Pen pen = new Brush();

        paper.drawFigure("Квадрат", pencil);

        paper.drawFigure("Овал",new Brush());

        paper.drawFigure("Овал",new Eraser());

        paper.drawFigure("Квадрат", new Marker());

        ColorPencil colorPencil = new ColorPencil();

        paper.drawFigure("Солнышко",colorPencil);
        colorPencil.setColor("Yellow");
        paper.drawFigure("Трава",colorPencil);

        Pen[] pens = new Pen[]{pencil,new Brush(),new Eraser(),new Marker(),colorPencil};
        for (int i = 0; i < pens.length; i++) {
            paper.drawFigure("Радуга",pens[i]);
        }
    }
}
