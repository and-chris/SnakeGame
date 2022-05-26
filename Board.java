public class Board{
    final int ROW_COUNT, COL_COUNT;
    private Cell[][] cells;

    public Board(int rowCount, int ColumnCounut){
        ROW_COUNT=rowCount;
        COL_COUNT= ColumnCounut;

        cells = new Cell[ROW_COUNT][COL_COUNT];

        for(int row =0; row < ROW_COUNT; row++){
            for(int col =0; col < COL_COUNT; col++){
                cells[row][col]=new Cell(row,column);
            }
        }
    }
    public Cell[][] getCells(){
        return cells;
    }
    public void setCells(Cell[][] cells){
        this.cells = cells;
    }
    public void GenerateFood(){
        while(true){
            int row = (int)(Math.random()*ROW_COUNT);
            int column = (int(Math.random()*COL_COUNT));
            if(cells[row][column].getCellType() != CellType.SNAKE_NODE)
                break;
        }
        cells[row][column].setCellType(CellType.FOOD)
    }

}