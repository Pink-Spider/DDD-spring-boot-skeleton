public interface BoardRepository {
    Board findById(Long id);
    void save(Board board);
}
