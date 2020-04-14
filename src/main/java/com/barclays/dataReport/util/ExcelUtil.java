package com.barclays.dataReport.util;

import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Component;

@Component
public class ExcelUtil {

	public Supplier<Stream<Row>> getRowStreamSupplier(Iterable<Row> rows) {
		return () -> getStream(rows);
	}

	public <T> Stream<T> getStream(Iterable<T> iterable) {
		return StreamSupport.stream(iterable.spliterator(), false);
	}
	
}
