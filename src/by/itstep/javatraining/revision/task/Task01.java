package by.itstep.javatraining.revision.task;

/*	Task 01. The Treasure Seekers and gold coins (1) [искатели сокровищ и золотые монеты]
 *
 *	N искателей сокровищ нашли K золотых монет и решили разделить их поровну.
 *	Определите, сколько золотых монет достанется каждому искателю.
 *
 *	Формат входных данных [input]
 *	На вход даётся два целых положительных числа N и K.
 *
 *	Формат выходных данных [output]
 *	Возвратите одно целое число - ответ на задачу.
 *
 *  Примечание
 *  На забудьте предусмотреть "защиту от дурака": если данные не подходят по условию задачи,
 *  то необходимо возвратить -1
 *
 *	[sample method  input 1] (пример передаваемых в метод параметров): 3 14
 *	[sample method output 1] (пример возвращаемого методом результата): 4
 *
 *	[ input 2]: 4 24
 *	[output 2]: 6
 *
 *	[ input 3]: 16 1
 *	[output 3]: 0
 *
 *	[ input 4]: -3 1
 *	[output 4]: -1
 */

public class Task01 {
    public static int start(int seeker, int coin) {
        if (seeker <= 0 || coin <= 0) {
            return -1;
        }

        int result = coin / seeker;

        if (seeker > coin) {
            result = 0;
        }
        return result;
    }
}