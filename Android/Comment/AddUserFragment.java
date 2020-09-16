package less_11_09_2020;
import androidx.fragment.app.Fragment;

    private User user;// создание закрытого класса User
    private EditText editUserName;// поле для редактирования текста
    private Button editUserBtn;//кнопка Button добавления юзера

public class AddUserFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);// вызываем родительски метод
        user = new User();

    }
    @Override
    public view onCreateView(){layoutInflater. ViewGroup container. Bundle savedInstState){
        View v = inFlater.(R.layout.add_user. container. false);

        editUserName = v.findViewId(R.layout)
        return  v;
    //onCreate создает фрагмент
        //onCreateView создаем дизайн - компоненты внутри фрагмента
       //inFlater

        FragmentManager fragmentManager = getSupportFragmentManager;//getSupportFragmentManager - создает фрагментмэнэджер FragmentManager
        Fragment fragment = new AddUserFragment();// создаем объект класса и положили в fragment
        fragmentManager.beginTransaction().add(R.id.fragmentContainert,fragment//идентификатор фрэйм лэаут)
}//beginTransaction .add можно много добавлять во фрпагмент
// Фрагмент остается после удаления активности.
    }
