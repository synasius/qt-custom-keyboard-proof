#include <QtAndroid>
#include <QAndroidJniObject>
#include "share.h"

Share::Share(QObject* parent) : QObject(parent)
{
}

void Share::share(const QString& title, const QString& subject, const QString& content)
{
    QAndroidJniObject jTitle = QAndroidJniObject::fromString(title);
    QAndroidJniObject jSubject = QAndroidJniObject::fromString(subject);
    QAndroidJniObject jContent = QAndroidJniObject::fromString(content);
    QAndroidJniObject activity = QtAndroid::androidActivity();
    QAndroidJniObject::callStaticMethod<void>(
        "it/evonove/Anacardi/ShareIntent",
        "shareText",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;"
              "Lorg/qtproject/qt5/android/bindings/QtActivity;)V",
        jTitle.object<jstring>(),
        jSubject.object<jstring>(),
        jContent.object<jstring>(),
        activity.object<jobject>()
   );
}
