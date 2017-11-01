package rtc.chayanee.jaturon.myanmar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import rtc.chayanee.jaturon.myanmar.R;

/**
 * Created by TUCKCOMPUTER-RB on 1/11/2560.
 */

public class RegisterFragment extends Fragment {

    //    Explicit
    private String nameString, emailString, passwordString;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Save Controller
        saveController();

    }   //main Method

    private void saveController() {
        ImageView imageView = (ImageView) getView().findViewById(R.id.imvSave);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Initial view
                EditText nameEditText = (EditText) getView().findViewById(R.id.edtName);
                EditText emailEditText = (EditText) getView().findViewById(R.id.edtEmail);
                EditText passwordEditText = (EditText) getView().findViewById(R.id.edtpassword);

//                Get Value From EditText
                nameString = nameEditText.getText().toString().trim();
                emailString = emailEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

//                Check Space
                if (!nameString.isEmpty() &&
                        !emailString.isEmpty() &&
                        !passwordString.isEmpty()) {
//                    No space

                } else {
//                    Have Space
                    Toast.makeText(getActivity(), "Have Space", Toast.LENGTH_SHORT).show();
                }

            }   // onCick
        });

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        return view;
    }
}
