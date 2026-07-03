package exe33;

import com.google.gson.annotations.SerializedName;

public record Titulo(@SerializedName("title") String titulo, @SerializedName("Year") String anoLancamento, @SerializedName("imdbRating") String avaliacao) {
}
