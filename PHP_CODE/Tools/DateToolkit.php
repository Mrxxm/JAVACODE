<?php

class DateToolkit
{
	// 获取比当天早n天的日期
	public static function getStartAndEndDayOfPreviousDays($days)
	{
		$endDay = date('Y-m-d', strtotime("-1 day"));
		$startDay = date("Y-m-d",strtotime("$endDay -$days day"));
		return [$startDay, $endDay];
	}

	/**
	 * [getDays 获取时间区间的所有天数]
	 * @param  [string] $startDay [开始时间(Y-m-d)]
	 * @param  [string] $endDay   [结束时间(Y-m-d)]
	 * @return [array]           [所有天数]
	 */
	// 注意格式 "2018-03-03"
	public static function getDays($startDay, $endDay)
	{
		$days = array($startDay);

        $currentDay = $startDay;
        var_dump($endDay);
        while ($currentDay < $endDay) {
            $currentDay = date('Y-m-d', strtotime("$currentDay + 1 day"));
            $days[] = $currentDay;
            var_dump($currentDay);
        }
        return $days;
	}
}

