package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static org.graalvm.compiler.debug.DebugOptions.Log;

public class MainActivity extends AppCompatActivity {

    private Button trueBtn; // Определили кнопку trueBtn (тип данных Button)
    private Button falseBtn;// Определили кнопку falseBtn (тип данных Button)
    private TextView textView;// Определили переменную (блок) TextView (место где будет текст)
    private Question[] questions = {//создаем массив questions с элементами - вопросами и ответами true/ false
            new Question(R.string.question1,true),//вопрос 1
            new Question(R.string.question2,false),// вопрос 2
            new Question(R.string.question3,true),// вопрос 3
            new Question(R.string.question4,false),// вопрос 4
            new Question(R.string.question5,true) //вопрос 5
    };
    private int currentIndex=0;// счетчик вопросов - текущий индекс массива (текущий вопрос 1)

    private String TAG = "Информация о запуске метода: "; // Cоздаем приватную строковую переменную TAG
    @Override
    protected void onCreate(Bundle savedInstanceState) { // Создаем активность распаковываем Bundle savedInstanceState (сохранение)
        super.onCreate(savedInstanceState);//
        Log.d(TAG,"Метод onCreate() запущен!");// при запуске метода onCreate будет отображаться "Метод onCreate() запущен!"
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){// если значение savedInstanceState пустое то выполняем инструкцию в скобках
            currentIndex = savedInstanceState.getInt("index");// перезаписываем номер текущего вопроса currentIndex до изменения активности (при повороте экрана данные не пропадут)
        }// т.е сохраняет состояние телефона (для Home - сред кнопка / Reset прав. кнопка. тел-на - работает, если нажать Back на телефоне - пропадет_)
        trueBtn = findViewById(R.id.trueBtn); // ищем в папке с ресурсами (res) R. идентификатор кнопки trueBtn
        falseBtn= findViewById(R.id.falseBtn); // ищем в папке с ресурсами R. идентификатор кнопки falseBtn
        textView= findViewById(R.id.textView); // ищем переменную textView на макете (папке R) и

        int question = questions[currentIndex].getQuestionTextId();// создаем переменную question и обращаемся к индексу массива questions
        textView.setText(question); // отображаем текст(вопросы) в блоке textView - вопросы будут появляться из массива question

        trueBtn.setOnClickListener(new View.OnClickListener() {// устанавливаем слушателя на клик на наш элемент trueBtn
            @Override // в () + реализация анонимного класса View.OnClickListener
            public void onClick(View view) {//  реализация метода onClick, т.е действий при нажатии на кнопку trueBtn
                checkAnswer(true);
                updateQuestion();// вызываем метод updateQuestion
            }
        });
        falseBtn.setOnClickListener(new View.OnClickListener() { // устанавливаем слушателя на (клик) наш элемент falseBtn -
            @Override // в () + реализация анонимного класса View.OnClickListener
            public void onClick(View view) { //  реализация метода onClick, т.е действий при нажатии на кнопку falseBtn
                checkAnswer(false);
                updateQuestion(); // вызываем метод updateQuestion для проверки правильности ответа
            }
        });
    }
    private void updateQuestion(){ // создали метод updateQuestion после ответа пользователя увеличиваем индекс массива (или номер следующего вопроса)
        currentIndex=(currentIndex+1)%questions.length;
        textView.setText(questions[currentIndex].getQuestionTextId());
    }

    private  void checkAnswer(boolean userAnswer){// создали метод updateQuestion для проверки ответа пользователя boolean userAnswer
        if (questions[currentIndex].isAnswerTrue() == userAnswer) //проверяем ответ пользователя с ответом в массиве, если совпадает то корретный ответ
            Toast.makeText(MainActivity.this, R.string.correct_toast,Toast.LENGTH_SHORT).show();//Всплывающее уведомление show о правильном ответе вопроса
        //(Контекст исполнения текущая активность MainActivity.this,ссылка на число идентификатор на корретный ответ,
        else
            Toast.makeText(MainActivity.this, R.string.incorrect_toast,Toast.LENGTH_SHORT).show();//Всплывающее уведомление о неправильном ответе
    }

    @Override//переопределяем метод
    public void onSaveInstanceState(Bundle savedInstanceState){ //создали метод onSaveInstanceState который сохраняет данные перед закрытием приложения
        super.onSaveInstanceState(savedInstanceState); //вызов метода родительского класса
        Log.d(TAG,"Метод onSaveInstanceState() запущен!!!"); //надпись - Метод onSaveInstanceState() запущен
        savedInstanceState.putInt("index",currentIndex); //putInt сохраняет номер вопроса с ключем  и индексом.
    }

    @Override//переопределяем метод
    public void onStart(){// создали метод onStart
        super.onStart();//вызов метода родительского класса
        Log.d(TAG,"Метод onStart() запущен");//надпись - Метод onStart() запущен
    }

    @Override//переопределяем метод
    public void onResume(){
        super.onResume();//вызов метода родительского класса
        Log.d(TAG,"Метод onResume() запущен");//надпись - Метод onResume() запущен
    }

    @Override//переопределяем метод
    public void onPause(){
        super.onPause();//вызов метода родительского класса
        Log.d(TAG,"Метод onPause() запущен");//надпись - Метод onPause() запущен
    }

    @Override//переопределяем метод
    public void onStop(){
        super.onStop();//вызов метода родительского класса
        Log.d(TAG,"Метод onStop() запущен");//надпись - Метод onStop() запущен
    }

    @Override//переопределяем метод
    public void onDestroy(){
        super.onDestroy();//вызов метода родительского класса
        Log.d(TAG,"Метод onDestroy() запущен");//надпись - Метод onDestroy() запущен
    }

    @Override//переопределяем метод
    public void onRestart(){
        super.onRestart();//вызов метода родительского класса
        Log.d(TAG,"Метод onRestart() запущен");//надпись - Метод onRestart()  запущен
    }
