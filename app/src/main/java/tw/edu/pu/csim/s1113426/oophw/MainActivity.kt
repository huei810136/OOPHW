package tw.edu.pu.csim.s1113426.oophw

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), OnClickListener, OnLongClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var txv : TextView = findViewById(R.id.txv)

        var img:ImageView = findViewById(R.id.img)
        img.setOnClickListener(this)
        txv.setOnClickListener(this)
        img.setOnLongClickListener(this)
    }

    override fun onClick(v: View?) {
        var txv:TextView = findViewById(R.id.txv)
        var img:ImageView = findViewById(R.id.img)
        if (v == txv){
            txv.text = "文字短按"
        }
        else {
            txv.text = "我是可愛的魟魚"
        }
    }

    override fun onLongClick(p0: View?): Boolean {
        var txv:TextView = findViewById(R.id.txv)
        txv.text = "魟魚長按"
        return true
    }
}

/*
interface Average{
    fun Avg():Float
}

 */