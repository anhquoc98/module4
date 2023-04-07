package com.example.book_borrowing_application.aop;

import com.example.book_borrowing_application.controller.ManagerBorrowController;
import com.example.book_borrowing_application.dto.BorrowBookCreateDTO;
import com.example.book_borrowing_application.model.BorrowBookModel;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Pointcut("execution(com.example.book_borrowing_application.controller.ManagerBorrowController *(..)))")
    public void loggingPerformBorrowPointCut() {
    }

    @Pointcut("execution(com.example.book_borrowing_application.controller.ManagerBorrowController *(..)))")
    public void loggingPerformGiveBackPointCut() {
    }

    @AfterReturning(pointcut = "loggingPerformBorrowPointCut()")
    public void handleAfterReturningPerformBorrow(JoinPoint joinPoint) {
        BorrowBookModel borrowBookCreateDTO = ((ManagerBorrowController) joinPoint.getTarget())
                .bookService.findById((Integer) joinPoint.getArgs()[0]);
        System.out.println("Sách" + borrowBookCreateDTO.getNameBook() + "đã mượn 1 ,còn lại:" + borrowBookCreateDTO.getQuantity() + "quyển sách");
    }

    @AfterReturning(pointcut = "loggingPerformGiveBackPointCut()")
    public void handleAfterReturningPerformGiveBack(JoinPoint joinPoint) {
        BorrowBookModel bookDTO = ((ManagerBorrowController) joinPoint.getTarget())
                .bookService.findById((Integer) joinPoint.getArgs()[1]);
        System.out.println("Sach " + bookDTO.getNameBook() + " da bi tra lai 1, con lai: "
                + bookDTO.getQuantity() + " quyen sach");
    }
}
