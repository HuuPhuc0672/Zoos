package com.example.zoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zoo.Adapter.Adapter_Zoo
import com.example.zoo.Mode.Animal

class ListAnimalActivity : AppCompatActivity() {
    private var animailist: ArrayList<Animal> = arrayListOf()
    private lateinit var zooadapter: Adapter_Zoo
    private val rcvView: RecyclerView by lazy { findViewById<RecyclerView>(R.id.rcvView) }
    private val btnBiling: ImageView by lazy { findViewById<ImageView>(R.id.btn_biling) }
    private val rcvViewNgang: RecyclerView by lazy { findViewById<RecyclerView>(R.id.rcvViewNgang) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_animal)

        rcvView.layoutManager = GridLayoutManager(this, 2)
        getData()
        zooadapter = Adapter_Zoo(this, animailist)
        rcvView.adapter = zooadapter

        rcvViewNgang.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rcvViewNgang.adapter=zooadapter







    }

    fun getData() {
        animailist.add(
            Animal(
                "Voi",
                "https://cdnmedia.baotintuc.vn/2016/07/04/15/44/voi.jpg",
                "33 năm",
                "40 km/h",
                "Voi phân bố rải rác khắp châu Phi cận Sahara, Nam Á, Đông Nam Á và thích ứng với nhiều môi trường sống khác nhau như thảo nguyên, rừng, sa mạc và đầm lầy",
                "Voi là loài động vật đất lớn nhất hiện có. Ba loài sống hiện đang được công nhận: voi rừng châu Phi, voi rừng châu Phi và voi châu Á. Chúng là những thành viên duy nhất còn sống sót của họ Elephantidae và bộ Proboscidea"
            )
        )
        animailist.add(
            Animal(
                "Hổ",
                "https://suckhoedoisong.qltns.mediacdn.vn/thumb_w/640/324455921873985536/2022/1/29/6-loai-ho-quy-hiem-nhat-hanh-tinhanh6-16434458525061434905646.png",
                "8 – 10 năm",
                "49 – 65 km/h ",
                "Phần lớn các loài hổ sống trong rừng và đồng cỏ . Trong số các loài mèo lớn, chỉ có hổ và báo đốm là bơi giỏi, và thông thường người ta hay thấy hổ tắm trong ao, hồ và sông.",
                "Hổ hay còn gọi là cọp hoặc hùm là một loài động vật có vú thuộc họ Mèo được xếp vào một trong năm loài \"mèo lớn\" thuộc chi Panthera. Hổ là một loài thú ăn thịt, chúng dễ nhận biết nhất bởi các sọc vằn dọc sẫm màu trên bộ lông màu đỏ cam với phần bụng trắng."
            )
        )
        animailist.add(
            Animal(
                "Cáo",
                "https://i.pinimg.com/736x/7a/3a/bd/7a3abd72e5dc5cdb13d555f69079f7d5.jpg",
                "3 – 4 năm",
                "50 - 80 km/h",
                "Cáo có mặt trên toànm bộ Bắc Bán cầu bao gồm hầu hết Bắc Mỹ, Châu Âu và Châu Á cộng với một phần của Bắc Phi.",
                "Cáo là tên gọi để chỉ một nhóm động vật, gồm có khoảng 27 loài với kích thước từ nhỏ đến trung bình, thuộc họ Chó, với đặc trưng là có mõm dài, hẹp, đuôi rậm, mắt xếch và tai nhọn"
            )
        )
        animailist.add(
            Animal(
                "Sư Tủ",
                "https://cdn1.tuoitre.vn/zoom/600_315/tto/i/s626/2015/12/23/hinh-6-1450866689.jpg",
                " 15 – 16 năm",
                "80 km/h",
                "Sư tử hoang hiện sinh sống ở vùng châu Phi hạ Sahara và châu Á (nơi quần thể còn sót lại cư ngụ ở vườn quốc gia Rừng Gir thuộc Ấn Độ), các phân loài sư tử tuyệt chủng từng sống ở Bắc Phi và Đông Nam Á",
                "Sư tử, là một trong những đại miêu trong họ Mèo và là một loài của chi Báo. Được xếp mức sắp nguy cấp trong thang sách Đỏ IUCN từ năm 1996, các quần thể loài này ở châu Phi đã bị sụt giảm khoảng 43% từ những năm đầu thập niên 1990"
            )
        )
        animailist.add(
            Animal(
                "Chó Soi",
                "https://e.khoahoc.tv/photos/image/2017/03/09/cho-soi.jpg",
                "16 năm",
                "50 – 60 km/h",
                "Về sinh thái của chó sói rừng, loài này thường sống ở các khu rừng sâu, vùng ven nương rẫy, gần các trạng trại hay khu dân cư trong rừng.",
                "Sói xám hay chó sói xám, hay đơn giản là sói là một loài động vật có vú thuộc Bộ Ăn thịt có nguồn gốc từ lục địa Á-Âu và Bắc Mỹ. Sói xám là thành viên lớn nhất trong Họ Chó và cũng là loài sói nổi tiếng nhất. Hơn 30 phân loài đã được công nhận"
            )
        )
        animailist.add(
            Animal(
                "Hươu cao cổ",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Rothschild%27s_Giraffe_%28Giraffa_camelopardalis_rothschildi%29_male_%287068054987%29%2C_crop_%26_edit.jpg/220px-Rothschild%27s_Giraffe_%28Giraffa_camelopardalis_rothschildi%29_male_%287068054987%29%2C_crop_%26_edit.jpg",
                "20 - 30 năm",
                "60 km/h",
                "Hươu cao cổ có phạm vi phân bố rải rác từ Tchad ở miền bắc đến Nam Phi ở miền nam, và từ Niger ở miền tây đến Somalia ở miền đông châu Phi. Hươu cao cổ thường sống ở xavan, đồng cỏ và rừng thưa.",
                "Chi Hươu cao cổ là một chi các động vật có vú thuộc bộ Guốc chẵn, là động vật cao nhất trên cạn và động vật nhai lại lớn nhất. Nó được phân loại trong họ Giraffidae, cùng với họ hàng gần nhất còn tồn tại của nó là hươu đùi vằn. Chi có 11 loài, bao gồm loài điển hình Giraffa camelopardalis"
            )
        )
        animailist.add(
            Animal(
                "Hà mã",
                "https://vuongquocloaivat.com/wp-content/uploads/2019/06/hinh-anh-con-ha-ma-compressed.jpg",
                "40 – 50 năm",
                "30 km/h",
                "Hà mã là loài sống nửa ở nước nửa trên cạn, cư trú ở các con sông, hồ và các đầm lầy rừng ngập mặn Tây Phi nơi những con đực chiếm lĩnh một đoạn sông và đứng đầu đàn gồm 5 đến 30 con cái và con non.",
                "Hà Mã là một loài động vật có vú ăn cỏ lớn sống ở châu Phi Hạ Sahara, và là một trong hai loài còn sinh tồn của Họ Hà mã; loài còn lại là hà mã lùn. Đây là một trong những loài thú có vú trên cạn lớn nhất và là động vật móng guốc chẵn nặng nhất, dù thấp hơn nhiều so với hươu cao cổ."
            )
        )
        animailist.add(
            Animal(
                "Hươu Sao",
                "https://upload.wikimedia.org/wikipedia/commons/f/f6/Cervus_nippon_002.jpg",
                " 3-5 năm ",
                "50 - 60 km/h",
                "Hươu sao thường sống ở trảng cỏ, rừng thưa có nhiều cỏ, lá non và gần nguồn nước. Độ cao thường không quá 500 m. Hươu sao thường sống thành đàn 3 - 5 con, có khi hàng chục con",
                "Hươu sao là một loài hươu có nguồn gốc ở phần lớn Đông Á và được du nhập đến nhiều nơi khác trên thế giới. Trước đây được tìm thấy từ miền bắc Việt Nam ở miền nam đến vùng Viễn Đông của Nga ở miền bắc, hiện nay nó không phổ biến ở những khu vực này, ngoại trừ Nhật Bản, nơi loài này sinh sôi quá mức."
            )
        )

        animailist.add(
            Animal(
                "Gấu trúc",
                "https://bloganchoi.com/wp-content/uploads/2021/01/gau-truc-fun-facts-10.jpg",
                "20 năm",
                "",
                "Gấu trúc lớn sống ở một vài vùng núi ở trung tâm Trung Quốc, chủ yếu ở Tứ Xuyên, nhưng cũng xuất hiện ở Thiểm Tây và Cam Túc.",
                "Gấu trúc lớn, cũng được gọi một cách đơn giản là gấu trúc, là một loài gấu nguồn gốc tại Trung Quốc. Nó dễ dàng được nhận ra bởi các mảnh màu đen, lớn xung quanh mắt, trên tai, và tứ chi nó. Tuy thuộc về bộ Carnivora, chế độ ăn của gấu trúc gồm hơn 99% tre, trúc",

            )
        )

        animailist.add(
            Animal(
                "Gấu",
                "https://e.khoahoc.tv/photos/image/082013/31/loai-gau.jpg",
                "20 năm",
                "40 km/h",
                "Gấu được tìm thấy trên các lục địa Bắc Mỹ, Nam Mỹ, Châu Âu và Châu Á. Trong 8 loài, gấu trắng Bắc Cực là loài lớn nhất (cũng là loài thuộc Bộ Ăn thịt lớn nhất trên cạn), cùng với gấu Kodiak - một phân loài của gấu nâu; còn gấu chó là loài nhỏ nhất.",
                "Gấu là những loài động vật có vú ăn thịt thuộc Họ Gấu. Chúng được xếp vào phân bộ Dạng chó. Mặc dù chỉ có 8 loài gấu còn sinh tồn, chúng phổ biến rất rộng rãi, xuất hiện ở nhiều môi trường sống khác nhau trên khắp Bắc Bán cầu và một phần ở Nam Bán cầu."

                )
        )
    }

}