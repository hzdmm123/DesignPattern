优点
在于它可以极大减少内存中对象的数量，使得相同对象或相似对象在内存中只保存一份；


缺点
使得系统更加复杂，并且需要将享元对象的状态外部化，而读取外部状态使得运行时间变长。