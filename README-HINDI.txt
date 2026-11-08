ALL CARD - ANDROID APP (Kotlin)
================================
Package name : com.allcard.digitalservices
Min Android  : 7.0 (API 24)

APP KYA KARTA HAI
- Splash screen (logo + animation) -> phir All Card website app ke andar (WebView) khulti hai.
- Website LIVE link se khulti hai, isliye jo bhi change GitHub par karoge wo app me apne-aap aa jayega
  (APK dobara banane ki zarurat nahi). Link na chale to app ke andar rakhi copy chalti hai (assets/index.html).
- Firebase wahi purana (all-print-card): login, users, plans, admin, sab same. Koi naya backend nahi.
- Downloads (PDF / JPG / PNG / CSV) Chrome ki tarah block nahi hote: seedhe  Downloads > All Card  folder me save hote
  hain aur "KHOLEIN" button aata hai.
- WhatsApp / Share: file ke sath share sheet khulti hai (PDF/photo seedhe WhatsApp me jati hai).
- Print button: Android print / Save as PDF.
- Photo / file upload (gallery, files) kaam karta hai.

APK KAISE BANAYEIN (sabse aasaan - GitHub par, free)
1. GitHub par naya repository banayein, jaise  All-Card-Android.
2. Is folder ki SAARI files (app/, gradle/, .github/, build.gradle.kts, settings.gradle.kts ...) us repo me upload karein.
3. Upload hote hi  Actions  tab me "Build APK" chalega (3-6 minute).
4. Run khulne par neeche  Artifacts > AllCard-APK  download karein, zip kholein, apk phone me install karein.
   (Phone me "Unknown sources / Install unknown apps" allow karna padega.)

Android Studio se: folder open karein -> Build > Build APK(s).

LINK CHECK (zaroori)
app/src/main/java/com/allcard/digitalservices/AppConfig.kt  me  LIVE_URL  aapki GitHub Pages website ka link hona chahiye:
   https://chandramohan2026.github.io/All-Card/
Agar aapka link alag hai to wahi ek line badal dein.

FIREBASE ME APP JODNA (sirf console me register karna hai)
1. Firebase Console > project  all-print-card  > Project settings > Add app > Android.
2. Package name:  com.allcard.digitalservices
3. SHA-1 (debug/release dono isi keystore se banti hain):
   55:BE:C5:46:98:B5:7D:92:C9:72:5B:43:AF:02:73:71:E7:2D:F2:C0
4. google-services.json download karke  app/  folder me rakh dein (app/google-services.json).
   Rakhte hi Firebase plugin apne-aap judd jayega. (Na rakhein tab bhi app chalega, web wala Firebase to chal hi raha hai.)

IMPORTANT NOTES
- App ek NAYA DEVICE maana jayega (browser se alag storage). Agar admin ne device limit lagaya hai to
  user ki device limit 1 badhani pad sakti hai.
- APK ka signature fix hai (app/allcard.jks), isliye naya APK purane ke upar update ho jata hai. Naya version dene par
  app/build.gradle.kts me versionCode 1 se 2, 3... badhayein.
- Play Store par dalna ho to apna alag keystore banayein (ye keystore sirf seedhe APK install ke liye hai).
- Replit par Android APK nahi ban pata (usme Android SDK nahi hota) - GitHub Actions ya Android Studio use karein.
