package exe29;

import com.google.gson.annotations.SerializedName;

public record Titulo(@SerializedName("Title") String titulo, @SerializedName("Year") String anoLancamento, @SerializedName("imdbRating") String avaliacao) {
}
