# QuizInheritance

Nama  : Muhamad Yusuf Maulana
NIM   : 1903851
Kelas : Pilkom B - 2019

pada source code kali ini saya mengubah beberapa class yang sebelumnya tidak menggunakan inheritance menjadi menggunakan inheritance
yang pertama pada class player, class player merupakan turunan dari class Item. dimana variabel dan fungsi yang digunakan di class player
sama dengan class item, jadi kita tidak perlu lagi menambah variabel dan fungsi yang sudah ada agar tidak membuat penuh code pada class player

Begitu juga pada class Pintu, sama seperti halnya class Player, class Pintu pun menggunakan beberapa variable dan fungsi yang sama seperti pada
class Item. Maka class Pintu pun termasuk inheritance dari class Item.

Pada modifikasinya saya menambahkan satu aksi pada player yaitu Mencari Item, dimana saat player memilihin aksi untuk "Mencari Item" maka player 
akan langsung menjalankan aksi yang sama saat berada di Ruangan. Jadi player tidak harus ke GameEngine terlebih dahulu untuk menjalankan aksi "Mencari Item" ini.
