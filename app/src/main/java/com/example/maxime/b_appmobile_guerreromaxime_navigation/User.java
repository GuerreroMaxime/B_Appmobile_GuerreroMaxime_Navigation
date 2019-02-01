package com.example.maxime.b_appmobile_guerreromaxime_navigation;

import android.content.Intent;
import android.os.Parcelable;
import android.os.Parcel;

public class User {             //Creation de la classe User
    private String login;       //Variable pour le nom
    private String password;    //Variable pour le prenom

    public User(String login, String pasword) {     //Association des variables a partir des éléments
        super();
        this.login = login;         //Association au login pour le nom
        this.password = password;   //Association au login pour le mot de passe
    }

    public User(Parcel source) {                 //Adaptation de la chaine de charactère
        this.login = source.readString();        //Adaptation de la chaine pour le nom
        this.password = source.readString();     //Adaptation de la chaine pour le mot de passe
    }

    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public int describeContes() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(login);
        dest.writeString(password);
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
/*
    //A mettre dans l'activité 1
    Intent intent = new Intent(A.this, B.class);
    User user = new User (login.getText().toString(), password.getText().toString());
    intent.putExtra(EXTRA_USER, user);
    startActivity(intent);

    //A mettre dans l'activité 2
    intent intent= getIntent();
    User user = intent.getParcelableArrayExtra(EXTRA_USER);
    login = (TextView) findViewById(R.id.userLogin);
    login.setText(user.getLogin());
    password = (TextView) findViewById(R.id.userPassword);
    password.setText(user.getPassword()); */

    //Exemple de la classe parcelable
/*
    import android.os.Parcel;
    import android.os.Parcelable;

    public class User implements Parcelable {
        private String login;
        private String password;


        public User(String login, String password) {
            super();
            this.login = login;
            this.password = password;
        }

        public User(Parcel source) {
            this.login = source.readString();
            this.password = source.readString();
        }

        @Override
        public int descripContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(login);
            dest.writeString(password);
        }
    }
        public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>(){

        @Override
        public  User createFormParcel(Parcel source) {
            return new User(source);
        }
        @Override
            public User[] newArray(int size){
            return new User[size];
        }

    };

    public String getLogin(){
        return login;
    }

    public void setLongin(String login){
        this.login = login;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
*/
