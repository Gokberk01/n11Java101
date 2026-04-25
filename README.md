Proje Özeti ve İşleyiş
Bu çalışma kapsamında, Java ve Spring Security kullanılarak JWT (JSON Web Token) tabanlı bir kimlik doğrulama sistemi geliştirilmiştir. Projenin temelinde, güvenlik standartlarından ödün verilmeden kullanıcı deneyiminin iyileştirilmesini sağlayan Refresh Token mekanizması yer almaktadır. Kullanıcı sisteme giriş yaptığında, kısa ömürlü bir access_token ve uzun ömürlü bir refresh_token üretilmektedir. access_token süresi dolduğunda (örneğin 15 dakika), kullanıcının tekrar şifre girmesine gerek kalmaksızın refresh_token aracılığıyla yeni bir erişim anahtarı atanmakta ve oturumun sürekliliği sağlanmaktadır.

API Uç Noktaları (Endpoints)
Proje yönetimi temel olarak beş ana uç nokta üzerinden gerçekleştirilmektedir:

/login: Kullanıcı adı ve şifre doğrulanmakta, işlemin başarılı olması durumunda her iki token istemciye iletilmektedir.

/refresh: İstemciden gelen refresh_token veritabanı/sistem üzerinde doğrulanmaktadır. Token geçerli olduğu takdirde eski yapı geçersiz kılınmakta ve yeni bir access_token üretilmektedir.

/signin: Kullanıcı bilgileri, BCrypt algoritması ile güvenli bir şekilde şifrelenerek veritabanına kaydedilmektedir.

/userlogout: Mevcut kullanıcı oturumunun güvenli bir şekilde sonlandırılması için kullanılmaktadır. Bu işlemle istemci tarafındaki token'ların temizlenmesi ve sunucu tarafındaki refresh token geçerliliğinin iptal edilmesi hedeflenmekte, böylece sistem güvenliği üst seviyede tutulmaktadır.

/allusers: Sistemde kayıtlı tüm kullanıcıların listelenmesine olanak tanıyan yönetimsel bir uç noktadır. Geliştirme aşamasında veritabanı doğrulaması yapılması veya yetkili kullanıcıların sistem genelindeki hesapları görüntülemesi amacıyla yapıya dahil edilmiştir.

Proje Yapılandırması (application.properties)
Uygulamanın çalışma ortamı ve veritabanı bağlantı detayları aşağıdaki parametrelerle yönetilmektedir:

Sunucu Portu: server.port=8080 ayarı ile uygulamanın yerel ağda varsayılan olarak 8080 portu üzerinden yayın yapması sağlanmıştır.

PostgreSQL Bağlantısı: Veritabanı katmanında PostgreSQL tercih edilmiştir. Uygulama, localhost:5432 adresindeki n11bootcamprefreshtoken isimli veritabanına postgres kullanıcı adı ve 1234 şifresi ile bağlanacak şekilde konfigüre edilmiştir.

Hibernate ve SQL İzleme:

spring.jpa.show-sql=true: Geliştirme sürecinde veri tutarlılığının takibi amacıyla, Hibernate tarafından üretilen tüm SQL sorgularının konsol üzerinden izlenmesine olanak tanınmıştır.

spring.jpa.hibernate.ddl-auto=create: Uygulamanın her başlatılmasında veritabanı şemasının sıfırdan oluşturulması sağlanmıştır.

Not: Bu ayar, geliştirme aşamasında şemayı güncel tutmak amacıyla create olarak belirlenmiştir; verilerin korunması gereken durumlarda update değerine çekilmesi gerekmektedir.
