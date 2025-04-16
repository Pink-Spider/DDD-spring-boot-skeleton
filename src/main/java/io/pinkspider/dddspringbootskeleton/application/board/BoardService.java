public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void handle(Long id, String name) {
        Board board = new Board(id, name);
        boardRepository.save(board);
    }
}
