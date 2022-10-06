package com.poputstoe_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.poputstoe_assignment.Adapter.transactionAdapter
import com.poputstoe_assignment.Model.transaction
import com.poputstoe_assignment.fragment.add_bank1
import com.poputstoe_assignment.fragment.add_meney
import com.poputstoe_assignment.fragment.money_transfer
import com.poputstoe_assignment.fragment.redeem

class Home : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var list: ArrayList<transaction>
    private lateinit var Money_transfer:AppCompatButton
    private lateinit var Add_money:LinearLayout
    private lateinit var send_money:LinearLayout
    private lateinit var Redeem:LinearLayout
    private lateinit var money:TextView
    private lateinit var back:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        recyclerView=findViewById(R.id.recycleview)
        Money_transfer=findViewById(R.id.transfer_money)
        Add_money=findViewById(R.id.add_money)
        Redeem=findViewById(R.id.redeem)
        send_money=findViewById(R.id.send_money)
        money=findViewById(R.id.money)
        money.text="67.50"
        back=findViewById(R.id.back)
        back.setOnClickListener {
            val i =Intent(this@Home,MainActivity::class.java)
            startActivity(i);
        }
        Money_transfer.setOnClickListener {
            val dialog=money_transfer()
            dialog.show(supportFragmentManager,"Money_Transfer")
        }
        Add_money.setOnClickListener {
            val dialog=add_meney()
            dialog.show(supportFragmentManager,"Add_money")
        }
        Redeem.setOnClickListener {
            val dialog=redeem()
            dialog.show(supportFragmentManager,"Redeem")
        }
        send_money.setOnClickListener {
            val dialog=add_bank1()
            dialog.show(supportFragmentManager,"send_money")
        }
        recyclerView.layoutManager=LinearLayoutManager(this)
        list= arrayListOf<transaction>()
        recyclerView.adapter=transactionAdapter(this,list)
        val ob1=transaction("492.0","order_KPZwEMiWQD5mD","8:42 am","05 Oct,2022","pay_KPZvpXMiWDQD5mD",true)
        list.add(ob1)
        val ob2=transaction("492.0","order_KPZwEMiWQD5mD","8:42 am","05 Oct,2022","pay_KPZvpXMiWDQD5mD",false)
        list.add(ob2)
        val ob3=transaction("490.0","order_KPZwEMiWQD5mD","8:46 am","05 Oct,2022","pay_KPZvpXMiWDQD5mD",true)
        list.add(ob3)


    }
}