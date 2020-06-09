/**
 * Класс, описывающий мысль, которая может возникнуть у ИИ (искусственного интеллекта)
 */
public class Thought {
    public enum Type {
        INSIGHT,        // Понимание, вспышка, осознание чего-то
        REMEMBRANCE,    // Воспоминание
        DESIRE,         // Желание
        NEED_TO_ACTION, // Потребность в действии
        NONE            // Ничего
    }

    // Эмоциональный окрас
    public enum EmotionalColor {
        POSITIVE,
        NEGATIVE,
        NEUTRAL,
        NONE
    }

    Type type;
    EmotionalColor emotionalColor;

    public void lost() {
        type = Type.NONE;
        emotionalColor = EmotionalColor.NONE;
    }
}
