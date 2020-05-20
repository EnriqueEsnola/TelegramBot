import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;




public class Telegram_bot extends TelegramLongPollingBot {




    @Override
    public void onUpdateReceived(Update update) {

        Message mensaje = update.getMessage();
        Long chatId = mensaje.getChatId();
        String mensajeRecibido = mensaje.getText();
        SendMessage enviarMensaje = new SendMessage();
        enviarMensaje.setChatId(chatId.toString());


        if ("/chicote".equals(mensajeRecibido)) {

            int videoAleatorio = (int) Math.floor(Math.random() * (5 - 0 + 1) + 1);

            if (videoAleatorio == 5) {
                enviarMensaje.setText("https://www.youtube.com/watch?v=1xabKsjwx6g");
            }
            if (videoAleatorio == 4) {
                enviarMensaje.setText("https://www.youtube.com/watch?v=1xabKsjwx6g");
            }
            if (videoAleatorio == 3) {
                enviarMensaje.setText("https://www.youtube.com/watch?v=1xabKsjwx6g");
            }
            if (videoAleatorio == 2) {
                enviarMensaje.setText("https://www.youtube.com/watch?v=1xabKsjwx6g");
            }
            if (videoAleatorio == 1) {
                enviarMensaje.setText("https://www.youtube.com/watch?v=1xabKsjwx6g");
            }
            if (videoAleatorio == 0) {
                enviarMensaje.setText("https://www.youtube.com/watch?v=1xabKsjwx6g");
            }




            try {
                sendMessage(enviarMensaje);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

        }
        @Override
        public String getBotUsername () {
            return "EnriqueGMQbot";
        }

        @Override
        public String getBotToken () {
            return "1157707841:AAEbnMl15oEKIsE1UW3svSMJt9ZDpJzmgL4";
        }

}
