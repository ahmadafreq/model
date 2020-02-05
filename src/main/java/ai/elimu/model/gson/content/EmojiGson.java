package ai.elimu.model.gson.content;

public class EmojiGson extends ContentGson {
    
    private String glyph; // E.g. '🦋'
    
    /**
     * The Unicode version when the glyph was first introduced.
     * <p />
     * Should be 9.0 or lower, in order to be compatible with Android SDK 7.0 (API level 24).
     */
    private Double unicodeVersion;
    
    /**
     * The Unicode Emoji version when the glyph was first introduced.
     * <p />
     * Should be 3.0 or lower, in order to be compatible with Android SDK 7.0 (API level 24).
     * <p />
     * See https://unicode.org/Public/emoji/3.0/emoji-data.txt
     */
    private Double unicodeEmojiVersion;

    public String getGlyph() {
        return glyph;
    }

    public void setGlyph(String glyph) {
        this.glyph = glyph;
    }

    public Double getUnicodeVersion() {
        return unicodeVersion;
    }

    public void setUnicodeVersion(Double unicodeVersion) {
        this.unicodeVersion = unicodeVersion;
    }

    public Double getUnicodeEmojiVersion() {
        return unicodeEmojiVersion;
    }

    public void setUnicodeEmojiVersion(Double unicodeEmojiVersion) {
        this.unicodeEmojiVersion = unicodeEmojiVersion;
    }
}
