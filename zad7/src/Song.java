import java.util.Objects;

class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Проверка ссылки на самого себя (рефлексивность)
        if (this == obj) return true;

        // 2. Проверка на null и тип объекта
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. Приведение типа
        Song other = (Song) obj;

        // 4. Сравнение полей
        return Objects.equals(title, other.title) &&
                Objects.equals(artist, other.artist) &&
                Objects.equals(songwriter, other.songwriter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, songwriter);
    }
}