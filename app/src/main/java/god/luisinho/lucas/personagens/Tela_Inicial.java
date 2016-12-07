package god.luisinho.lucas.personagens;

import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tela_Inicial extends AppCompatActivity {

    //Widgets

    private Button btnAa;
    private Button btnAm;
    private Button btnAz;
    private Button btnDi;
    private Button btnIr;
    private Button btnJh;
    private Button btnTa;
    private Button btnTh;
    private Button btnUd;
    private Button btnVa;
    private Button btnWa;
    private Button btnZe;

    //MediaPlayer
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela__inicial);

        //Referencias

        btnAa = (Button) findViewById(R.id.aat);
        btnAm = (Button) findViewById(R.id.amu);
        btnAz = (Button) findViewById(R.id.azi);
        btnDi = (Button) findViewById(R.id.dia);
        btnIr = (Button) findViewById(R.id.Ir);
        btnJh = (Button) findViewById(R.id.jhi);
        btnTa = (Button) findViewById(R.id.ta);
        btnTh = (Button) findViewById(R.id.Thr);
        btnUd = (Button) findViewById(R.id.ud);
        btnVa = (Button) findViewById(R.id.vay);
        btnWa = (Button) findViewById(R.id.War);
        btnZe = (Button) findViewById(R.id.zed);


        //Aatrox -------------------------------------------------------------------
        btnAa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_aa_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.aatrox);
            }//fecha onClick
        });//fecha onClickListener

        btnAa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_aa_alert_title));
                msg.setMessage(getResources().getText(R.string.home_aa_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Amumu ---------------------------------------------------------------------------
        btnAm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_am_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.amumu);
            }//fecha onClick
        });//fecha onClickListener

        btnAm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_am_alert_title));
                msg.setMessage(getResources().getText(R.string.home_am_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Azir ---------------------------------------------------------------------------
        btnAz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_az_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.azir);
            }//fecha onClick
        });//fecha onClickListener

        btnAz.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_az_alert_title));
                msg.setMessage(getResources().getText(R.string.home_az_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Diana ---------------------------------------------------------------------------
        btnDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_di_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.diana);
            }//fecha onClick
        });//fecha onClickListener

        btnDi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_di_alert_title));
                msg.setMessage(getResources().getText(R.string.home_di_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Irelia ---------------------------------------------------------------------------
        btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_ir_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.irelia);
            }//fecha onClick
        });//fecha onClickListener

        btnIr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_ir_alert_msg));
                msg.setMessage(getResources().getText(R.string.home_ir_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Jhin ---------------------------------------------------------------------------
        btnJh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_jh_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.jhin);
            }//fecha onClick
        });//fecha onClickListener

        btnJh.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_jh_alert_title));
                msg.setMessage(getResources().getText(R.string.home_jh_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Talon ---------------------------------------------------------------------------
        btnTa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_ta_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.talon);
            }//fecha onClick
        });//fecha onClickListener

        btnTa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_ta_alert_title));
                msg.setMessage(getResources().getText(R.string.home_ta_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Thresh ---------------------------------------------------------------------------
        btnTh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_th_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.thresh);
            }//fecha onClick
        });//fecha onClickListener

        btnTh.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_th_alert_title));
                msg.setMessage(getResources().getText(R.string.home_th_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Udyr ---------------------------------------------------------------------------
        btnUd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_ud_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.udyr);
            }//fecha onClick
        });//fecha onClickListener

        btnUd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_ud_alert_title));
                msg.setMessage(getResources().getText(R.string.home_ud_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Vayne ---------------------------------------------------------------------------
        btnVa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_va_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.vayne);
            }//fecha onClick
        });//fecha onClickListener

        btnVa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_va_alert_title));
                msg.setMessage(getResources().getText(R.string.home_va_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Warwick ---------------------------------------------------------------------------
        btnWa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_wa_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.warwick);
            }//fecha onClick
        });//fecha onClickListener

        btnWa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_wa_alert_title));
                msg.setMessage(getResources().getText(R.string.home_wa_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener

        // Zed ---------------------------------------------------------------------------
        btnZe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getBaseContext(),
                        getResources().getText(R.string.home_ze_toast),
                        Toast.LENGTH_LONG).show();
                play(view, R.raw.zed);
            }//fecha onClick
        });//fecha onClickListener

        btnZe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(Tela_Inicial.this);
                msg.setTitle(getResources().getText(R.string.home_ze_alert_title));
                msg.setMessage(getResources().getText(R.string.home_ze_alert_msg));
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_OK), null);
                msg.show();
                return true;
            }//fecha onLongClick
        });//fecha onLongClickListener
    }//fecha onCreate

    public void play(View v, int som){
        try {
            mp = MediaPlayer.create(getBaseContext(), som);
            mp.start();
        }catch (Exception e){
            mp.stop();
        }//fecha catch
    }//fecha play
}//fecha Tela_Inicial
