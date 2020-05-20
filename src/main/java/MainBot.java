import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class MainBot {
        public static void main(String[] args) {

            ApiContextInitializer.init();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
            try {
                    telegramBotsApi.registerBot(new Telegram_bot());

                    } catch (TelegramApiException e) {
                    e.printStackTrace();
            }
        }
}

