package com.poputstoe_assignment.Adapter


import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.poputstoe_assignment.Model.transaction
import com.poputstoe_assignment.R

class transactionAdapter(val context: Context,val transactionList:ArrayList<transaction>)
    :RecyclerView.Adapter<transactionAdapter.transcationHiewholder>(){
class transcationHiewholder(itemView: View):RecyclerView.ViewHolder(itemView)
{
    val Amount:TextView=itemView.findViewById(R.id.money)
    val Date:TextView=itemView.findViewById(R.id.date)
    val Time:TextView=itemView.findViewById(R.id.time)
    val Status:TextView=itemView.findViewById(R.id.status)
    val Order:TextView=itemView.findViewById(R.id.order)
    val Transaction_id:TextView=itemView.findViewById(R.id.transaction)

}


    override fun onBindViewHolder(holder: transcationHiewholder, position: Int) {
        val tra_list=transactionList[position]
        holder.Date.text=tra_list.date
        holder.Time.text=tra_list.time
        holder.Transaction_id.text=tra_list.transaction_id
        holder.Order.text=tra_list.order
        if (tra_list.status==true)
        {
            holder.Amount.text=tra_list.amount
            holder.Amount.setTextColor(Color.parseColor("#1EE80F"))
            holder.Status.text="TXN_SUCCESS"
            holder.Status.setTextColor(Color.parseColor("#1EE80F"))
        }
        else
        {
            holder.Amount.text=tra_list.amount
            holder.Amount.setTextColor(Color.parseColor("#ED2E0C"))
            holder.Status.text="TXN_FILLED"
            holder.Status.setTextColor(Color.parseColor("#ED2E0C"))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): transcationHiewholder {
        val view=LayoutInflater.from(context).inflate(R.layout.transaction_item,parent,false)
        return transcationHiewholder(view)
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }
}