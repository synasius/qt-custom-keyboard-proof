#ifndef SHARE_H
#define SHARE_H

#include <QObject>

class Share : public QObject
{
    Q_OBJECT
public:
    explicit Share(QObject* parent = 0);

    Q_INVOKABLE void share(const QString& title, const QString& subject, const QString& content);
};

#endif // SHARE_H

