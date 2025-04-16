public class JpaBoardRepository implements BoardRepository {
    @Override
    public Board findById(Long id) {
        return new Board(id, "Sample");
    }

    @Override
    public void save(Board board) {
        System.out.println("Saved board: " + board.getName());
    }
}
